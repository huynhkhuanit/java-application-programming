import os

def generate_java_links(directory):
    """
    Tạo danh sách các liên kết đến file .java trong thư mục và các thư mục con.

    Args:
        directory (str): Đường dẫn đến thư mục chứa các file .java.

    Returns:
        list: Danh sách các liên kết theo relative path.
    """
    links = []
    
    for root, _, files in os.walk(directory):
        for file in files:
            if file.endswith(".java"):
                # Tạo đường dẫn tương đối
                relative_path = os.path.relpath(os.path.join(root, file), directory)
                link = f"[{file}]({relative_path.replace('\\', '/')})"
                links.append(link)

    return links

def save_to_markdown(links, output_file):
    """
    Lưu danh sách liên kết thành file markdown.

    Args:
        links (list): Danh sách liên kết.
        output_file (str): Đường dẫn file markdown đầu ra.
    """
    with open(output_file, 'w', encoding='utf-8') as f:
        f.write("# Java File Links\n\n")
        for link in links:
            f.write(f"- {link}\n")

if __name__ == "__main__":
    # Đường dẫn thư mục chứa file .java
    java_directory = input("Nhập đường dẫn thư mục chứa file .java: ")
    
    # Đường dẫn file markdown đầu ra
    output_markdown = "java_file_links.md"

    # Tạo danh sách liên kết
    java_links = generate_java_links(java_directory)

    # Lưu danh sách vào file markdown
    save_to_markdown(java_links, output_markdown)

    print(f"Đã tạo file markdown chứa danh sách liên kết tại: {output_markdown}")
