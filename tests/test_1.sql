SET hivevar:DAT_RFRC = 202001;
SET mapred.ouput.compression.type = BLOCK;
SET io.seqfile.compression.type = BLOCK;
SET DAT_RFRC=XX_DTREF-MC-rt2_ai6_utmm2rc1_ut_rems_oran0110_001-MAX-1-_XX;

SELECT
    a,
    b,
    c
FROM tab_test_${DAT_RFRC}
WHERE anomes <= ${hiveconf:DAT_RFRC}
;