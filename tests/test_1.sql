-- Hiveparser tests

-- CREATE TABLE tbuo_teste STORED AS TEXTFILE AS SELECT cpf, agen, con FROM uo.xpto;

CREATE TABLE tbuo_teste 
(
    cpf STRING,
    agen STRING,
    cont STRING
)
PARTITIONED BY (anomes INT)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ';'
LINES TERMINATED BY '\n'
LOCATION '\dados\prod\uo_teste\tbuo_teste'
;