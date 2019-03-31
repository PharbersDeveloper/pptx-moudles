package com.pharbers.pptxmoudles

import com.pharbers.common.commonMoudle
import com.pharbers.macros.api.commonEntity
import com.pharbers.macros.common.connecting.{One2OneConn, ToStringMacro}

@One2OneConn[PhExcelPush]("push")
@One2OneConn[PhExcel2PPT]("e2p")
@One2OneConn[PhExportPPT]("exp")
@One2OneConn[PhTextPPT]("text")
@One2OneConn[PhExcel2Chart]("e2c")
@One2OneConn[PhCreateSlider]("slider")
class PhRequest() extends commonEntity{
    var jobid: String =""
    var command: String = ""
}
