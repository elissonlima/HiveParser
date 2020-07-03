
import hiveparser
import os
import time

root="C:\\Users\\elisson.lima\\Documents\\brissant\\103_relatorio_arrecadacao_por_mes"

for path, subdirs, files in os.walk(root):
    for name in files:
        file_path = os.path.join(path, name)
        print(file_path, end=' ')
        filename, file_extension = os.path.splitext(file_path)
        
        if file_extension.lower() == ".sql":
            try:
                hiveparser.parse(file_path)
                print("[ OK ]")
            except Exception as e:
                print("[FALHOU] ", e)
