
--
-- Temporary view structure for view `v_sellview`
--

DROP TABLE IF EXISTS `v_sellview`;
/*!50001 DROP VIEW IF EXISTS `v_sellview`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `v_sellview` AS SELECT
 1 AS `sellID`,
 1 AS `spname`,
 1 AS `spid`,
 1 AS `gg`,
 1 AS `dj`,
 1 AS `sl`,
 1 AS `je`,
 1 AS `khname`,
 1 AS `xsdate`,
 1 AS `czy`,
 1 AS `jsr`,
 1 AS `jsfs`*/;
SET character_set_client = @saved_cs_client;

--
-- Final view structure for view `v_sellview`
--

/*!50001 DROP VIEW IF EXISTS `v_sellview`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `v_sellview` AS select `tb_sell_detail`.`sellID` AS `sellID`,`tb_spinfo`.`spname` AS `spname`,`tb_sell_detail`.`spid` AS `spid`,`tb_spinfo`.`gg` AS `gg`,`tb_sell_detail`.`dj` AS `dj`,`tb_sell_detail`.`sl` AS `sl`,`tb_sell_main`.`je` AS `je`,`tb_sell_main`.`khname` AS `khname`,`tb_sell_main`.`xsdate` AS `xsdate`,`tb_sell_main`.`czy` AS `czy`,`tb_sell_main`.`jsr` AS `jsr`,`tb_sell_main`.`jsfs` AS `jsfs` from ((`tb_sell_main` join `tb_sell_detail` on((`tb_sell_main`.`sellID` = `tb_sell_detail`.`sellID`))) join `tb_spinfo` on((`tb_sell_detail`.`spid` = `tb_spinfo`.`id`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-04-06 13:10:24