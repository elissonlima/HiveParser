-- Hiveparser tests

-- CREATE TABLE tbuo_teste STORED AS TEXTFILE AS SELECT cpf, agen, con FROM uo.xpto;

-- CREATE TABLE tbuo_teste 
-- (
--     cpf STRING,
--     agen STRING,
--     cont STRING
-- )
-- PARTITIONED BY (anomes INT)
-- ROW FORMAT DELIMITED
-- FIELDS TERMINATED BY ';'
-- LINES TERMINATED BY '\n'
-- LOCATION '\dados\prod\uo_teste\tbuo_teste'
-- ;

-- SELECT cpf, cnpj FROM tab1
-- UNION 
-- SELECT cpf, cnpj FROM tab2
-- UNION ALL
-- SELECT cpf, cnpj FROM tab3
-- ;

-- CREATE TABLE uo.teste_1 LIKE uo.teste_2;

--DROP TABLE IF EXISTS rt2.des;

SET DB_RT2 = rt2;
SET DAT_REF = 202001;

select * from ${hiveconf:DB_RT2}.tabela where anomes = ${hiveconf:DAT_REF} ;