-- SET hive.resultset.use.unique.column.names.
-- SET hivevar:DAT_RFRC = 202001;
-- SET mapred.ouput.compression.type = BLOCK;
-- SET io.seqfile.compression.type = BLOCK;
-- SET hivevar:DAT_RFRC = XX_DTREF-A-rt2_ai6_utmm2rc1_ut_rems_oran0110_001-MAX-1-_XX;

SET mapred.job.name = TRANBRU_NADA_A_VER_${DAT_RFRC};

SELECT 
    E.abc,
    COALESCE(E.abc, 1029),
    LAG(a,b,c,d,e) OVER()
FROM teste ;
