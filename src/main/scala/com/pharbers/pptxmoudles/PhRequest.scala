package com.pharbers.pptxmoudles

import com.pharbers.common.commonMoudle
import com.pharbers.macros.api.commonEntity
import com.pharbers.macros.common.connecting.{One2OneConn, ToStringMacro}

@One2OneConn[PhExcelPush]("PhExcelPush")
@One2OneConn[PhExcel2PPT]("PhExcel2PPT")
@One2OneConn[PhExportPPT]("PhExportPPT")
@ToStringMacro
class PhRequest()  extends commonEntity{
    var jobid: String =""
    var command: String = ""
    var push: PhExcelPush = new PhExcelPush
    var e2p: PhExcel2PPT = new PhExcel2PPT
    var exp: PhExportPPT = new PhExportPPT
}
