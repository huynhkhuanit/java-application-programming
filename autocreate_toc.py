import re

def generate_toc(md_file):
    with open(md_file, 'r', encoding='utf-8') as file:
        lines = file.readlines()
    
    toc = []
    for line in lines:
        match = re.match(r'^(#{1,6}) (.+)', line)
        if match:
            level = len(match.group(1))
            title = match.group(2)
            # Chuyển tiêu đề thành dạng slug
            link = re.sub(r'[^\w\s-]', '', title, flags=re.UNICODE)  # Loại bỏ ký tự đặc biệt trừ dấu gạch nối và khoảng trắng
            link = link.strip().replace(' ', '-').lower()  # Thay khoảng trắng bằng gạch nối
            toc.append(f"{'  ' * (level - 1)}- [{title}](#{link})")
    
    return '\n'.join(toc)

# Sử dụng script:
md_file = './Ly_Thuyet/Buoi-01/Buoi01_JavaSyntax.md'  # Đổi 'file.md' thành tên file Markdown của bạn
toc = generate_toc(md_file)
print("MỤC LỤC:")
print(toc)
