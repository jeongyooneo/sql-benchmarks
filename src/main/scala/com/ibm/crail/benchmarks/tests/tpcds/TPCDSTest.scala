package com.ibm.crail.benchmarks.tests.tpcds

import com.ibm.crail.benchmarks.{ParseOptions, SQLTest}
import org.apache.spark.sql.SparkSession

/**
  * Created by atr on 04.09.17.
  */
class TPCDSTest (val options: ParseOptions, spark:SparkSession) extends SQLTest(spark){
  // you set up the temp view
  TPCDSSetup.readAndRegisterTempTables(options, spark)

  private val result = ???

  override def execute(): String = takeAction(options, result)

  override def explain(): Unit = ???

  override def plainExplain(): String = s"TPC-DS query ${options.getQueryNumber} on " + options.getInputFiles()(0)
}
