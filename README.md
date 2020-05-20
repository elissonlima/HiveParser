# HiveParser

### Hive Query Language Parser to JSON

#### Usage 

```python
import hiveparser

sql_str = "SELECT * FROM teste;"
path_file = "c:\path\for\file"

#String Input
hiveparser.parse(sql_str)

#Path for sql file input
hiveparser.parse(path_file)

#TextIOWrapper input
with open(path_file) as arq_sql:
	hiveparser.parse(arq_sql)
```