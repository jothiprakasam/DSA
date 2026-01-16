import os
import html
import shutil

IGNORE_DIRS = {'.git', '.github', 'assets', 'website_out'}
OUTPUT_DIR = 'website_out' # We will build the site here

def create_page(path, title, body_content):
    style = """
    <style>
        body { font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Helvetica, Arial, sans-serif; line-height: 1.6; max-width: 800px; margin: 40px auto; padding: 20px; background: #f6f8fa; }
        .card { background: white; border: 1px solid #d0d7de; border-radius: 6px; padding: 16px; margin-bottom: 10px; }
        a { color: #0969da; text-decoration: none; font-weight: bold; }
        a:hover { text-decoration: underline; }
        pre { background: #f6f8fa; padding: 16px; border-radius: 6px; overflow: auto; border: 1px solid #d0d7de; font-size: 14px; }
        .breadcrumb { margin-bottom: 20px; color: #57606a; }
    </style>
    """
    full_html = f"<html><head>{style}<title>{title}</title></head><body>"
    full_html += f"<div class='breadcrumb'><a href='index.html'>Home</a> / {title}</div>"
    full_html += body_content
    full_html += "</body></html>"
    
    with open(os.path.join(OUTPUT_DIR, path), 'w', encoding='utf-8') as f:
        f.write(full_html)

def build_structure():
    if os.path.exists(OUTPUT_DIR):
        shutil.rmtree(OUTPUT_DIR)
    os.makedirs(OUTPUT_DIR)

    repo_structure = {}
    
    # 1. Scan the files
    for root, dirs, files in os.walk('.'):
        dirs[:] = [d for d in dirs if d not in IGNORE_DIRS]
        rel_path = os.path.relpath(root, '.')
        
        valid_files = [f for f in files if f.endswith(('.cpp', '.java', '.py', '.js'))]
        if valid_files or (rel_path != '.'):
            repo_structure[rel_path] = valid_files

    # 2. Create individual Code Pages
    for folder, files in repo_structure.items():
        for file in files:
            file_path = os.path.join(folder, file)
            with open(file_path, 'r', encoding='utf-8') as f:
                code = html.escape(f.read())
            
            page_name = f"{folder}_{file}.html".replace('/', '_').replace('\\', '_')
            create_page(page_name, file, f"<h2>{file}</h2><pre><code>{code}</code></pre>")

    # 3. Create Folder/Index Page
    index_content = "<h1>DSA Explorer by Jothi Prakasam</h1>"
    for folder, files in repo_structure.items():
        if folder == '.': continue
        index_content += f"<div class='card'><h3>📁 {folder}</h3><ul>"
        for file in files:
            page_link = f"{folder}_{file}.html".replace('/', '_').replace('\\', '_')
            index_content += f"<li><a href='{page_link}'>{file}</a></li>"
        index_content += "</ul></div>"

    create_page("index.html", "Home", index_content)

if __name__ == "__main__":
    build_structure()
