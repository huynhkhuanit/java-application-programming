# CẤU HÌNH VISUAL STUDIO CODE CHO THƯ VIỆN JAVAFX
##  :receipt: THƯ VIỆN JAVAFX LÀ GÌ?
- JavaFX là một thư viện mạnh mẽ được Oracle phát triển để tạo các ứng dụng giao diện đồ họa (GUI - Graphical User Interface) trên nền tảng Java. JavaFX là sự thay thế hiện đại và cải tiến cho thư viện Swing trước đây, cung cấp nhiều tính năng mạnh mẽ, trực quan, và hỗ trợ xây dựng các ứng dụng đa nền tảng với giao diện đẹp mắt.
## SETTINGS JAVAFX TRÊN VS CODE
1. Tải tại liên kết sau: https://openjfx.io/
2. Tạo thư mục `.vscode` chứa các thư mục con sau: / `settings.json` / `lauch.json` / `tasks.json` /
3. File `settings.json`:
    ```json
    {
        "java.project.sourcePaths": [
            "."
        ],
        "java.project.outputPath": "bin",
        "java.project.referencedLibraries": [
            "C:/Program Files/javafx-sdk-23.0.1/lib/*.jar"
        ]
    }
    ```
3. File `lauch.json`:
    ```json
    {
        "version": "0.2.0",
        "configurations": [
            {
                "type": "java",
                "name": "Run Current File",
                "request": "launch",
                "mainClass": "${file}",
                "cwd": "${workspaceFolder}"
            },
            {
                "type": "java",
                "name": "Run JavaFX File",
                "request": "launch",
                "mainClass": "${file}",
                "cwd": "${workspaceFolder}",
                "vmArgs": "--module-path C:/Program Files/javafx-sdk-23.0.1/lib --add-modules javafx.controls,javafx.fxml"
            }
        ]
    }
    ```
3. File `settings.json`:
    ```json
    {
        "version": "2.0.0",
        "tasks": [
            {
                "label": "Build Java Project",
                "type": "shell",
                "command": "javac",
                "args": [
                    "-d",
                    "bin",
                    "--module-path",
                    "C:/Program Files/javafx-sdk-23.0.1/lib",
                    "--add-modules",
                    "javafx.controls,javafx.fxml",
                    "${file}"
                ],
                "group": {
                    "kind": "build",
                    "isDefault": true
                },
                "problemMatcher": {
                    "owner": "java",
                    "fileLocation": ["relative", "${workspaceFolder}"],
                    "pattern": {
                        "regexp": "^(.*):(\\d+):\\s+error:\\s+(.*)$",
                        "file": 1,
                        "line": 2,
                        "message": 3
                    }
                },
                "detail": "Build the current Java file"
            },
            {
                "label": "Run JavaFX Application",
                "type": "shell",
                "command": "java",
                "args": [
                    "--module-path",
                    "C:/Program Files/javafx-sdk-23.0.1/lib",
                    "--add-modules",
                    "javafx.controls,javafx.fxml",
                    "-cp",
                    "bin",
                    "${fileBasenameNoExtension}"
                ],
                "group": {
                    "kind": "test",
                    "isDefault": true
                },
                "problemMatcher": [],
                "detail": "Run the current JavaFX application"
            }
        ]
    }
    ```
- **Lưu ý**: Các phần liên quan tới module-path thì phải liên kết tới thư mục chứa JavaFX SDK trong máy tính của bạn.