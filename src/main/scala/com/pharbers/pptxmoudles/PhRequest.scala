package com.pharbers.pptxmoudles

import com.pharbers.macros.common.connecting.One2OneConn

@One2OneConn[PhExcelPush]("PhExcelPush")
@One2OneConn[PhExcel2PPT]("PhExcel2PPT")
@One2OneConn[PhExportPPT]("PhExportPPT")
case class PhRequest(id: String, jobid: String, command: String, push: PhExcelPush, e2p: PhExcel2PPT, exp: PhExportPPT)
