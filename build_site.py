import os
import html
import shutil

# This points to where your actual code folders are
BASE_DIR = 'learning-java/src'
OUTPUT_DIR = 'website_out'

def create_page(path, title, body_content):
    style = """
    <style>
        body { font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Helvetica, Arial, sans-serif; line-height: 1.6; max-width: 900px; margin: 40px auto; padding: 20px; background: #f6f8fa; }
        .card { background: white; border: 1px solid #d0d7de; border-radius: 6px; padding: 16px; margin-bottom: 10px; }
        a { color: #0969da; text-decoration: none; font-weight: bold; }
        pre { background: #eeeeee; padding: 16px; border-radius: 6px; overflow: auto; border: 1px solid #d0d7de; font-family: 'Consolas', 'Monaco', monospace; }
        .breadcrumb { margin-bottom: 20px; color: #57606a; }
        h1 { color: #24292f; border-bottom: 1px solid #d0d7de; padding-bottom: 10px; }
        h2 { color: #24292f; margin-top: 0; }
        li { margin-bottom: 5px; }
    </style>
    """
    full_html = f"<html><head>{style}<title>{title}</title></head><body>"
    full_html += f"<div class='breadcrumb'><a href='index.html'>🏠 Home</a> / {title}</div>"
    full_html += body_content
    full_html += "</body></html>"
    
    with open(os.path.join(OUTPUT_DIR, path), 'w', encoding='utf-8') as f:
        f.write(full_html)

def build_structure():
    if os.path.exists(OUTPUT_DIR):
        shutil.rmtree(OUTPUT_DIR)
    os.makedirs(OUTPUT_DIR)

    repo_structure = {}
    
    # Check if the directory exists to avoid errors
    if not os.path.exists(BASE_DIR):
        print(f"Error: {BASE_DIR} not found!")
        return

    for root, dirs, files in os.walk(BASE_DIR):
        rel_path = os.path.relpath(root, BASE_DIR)
        
        # Only pick programming files
        valid_files = [f for f in files if f.endswith(('.java', '.cpp', '.py', '.js'))]
        if valid_files:
            repo_structure[rel_path] = valid_files

    # Create Code Pages
    for folder, files in repo_structure.items():
        for file in files:
            file_path = os.path.join(BASE_DIR, folder, file) if folder != '.' else os.path.join(BASE_DIR, file)
            try:
                with open(file_path, 'r', encoding='utf-8') as f:
                    code = html.escape(f.read())
            except Exception as e:
                code = f"Error reading file: {e}"
            
            # Generate a clean filename for the HTML page
            page_name = f"{folder}_{file}.html".replace('.', '_dot_').replace('/', '_').replace('\\', '_')
            create_page(page_name, file, f"<h2>{file}</h2><pre><code>{code}</code></pre>")

    # Create Index (Home) Page
    index_content = "<h1>My DSA Solution Dashboard</h1>"
    
    # Sort folders alphabetically
    for folder in sorted(repo_structure.keys()):
        files = repo_structure[folder]
        display_name = "General" if folder == "." else folder
        index_content += f"<div class='card'><h3>📁 {display_name}</h3><ul>"
        for file in files:
            page_link = f"{folder}_{file}.html".replace('.', '_dot_').replace('/', '_').replace('\\', '_')
            index_content += f"<li><a href='{page_link}'>{file}</a></li>"
        index_content += "</ul></div>"

    create_page("index.html", "Home", index_content)

if __name__ == "__main__":
    build_structure()
