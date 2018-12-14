package com.pharbers.pptxmoudles

import com.pharbers.macros.api.commonEntity
import com.pharbers.macros.common.connecting.One2OneConn

@One2OneConn[PhExcelCss]("css")
class PhExcelPush() extends commonEntity{
    var name: String = ""
    var cell: String = ""
    var cate: String = ""
    var value: String = ""
}