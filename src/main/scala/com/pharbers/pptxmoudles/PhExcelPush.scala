package com.pharbers.pptxmoudles

import com.pharbers.macros.api.commonEntity
import com.pharbers.macros.common.connecting.One2OneConn

class PhExcelPush() extends commonEntity{
    var name: String = ""
    //-c#cell-s#style-v#value
    var cells: List[String] = Nil
}