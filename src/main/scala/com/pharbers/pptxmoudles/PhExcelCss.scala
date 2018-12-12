package com.pharbers.pptxmoudles

import com.pharbers.macros.api.commonEntity

class PhExcelCss extends commonEntity{
    var factory = "com.pharbers.process.stm.step.pptx.slider.content.phReportContentImpl"
    var cell = ""
    var fontSize = ""
    var fontColor = ""
    var fontName = ""
    var fontStyle: List[String] = Nil
    var cellColor = ""
    var cellBorders: List[String] = Nil
    var cellBordersColor = "#CDFFFF"
    var width = "0"
    var height = "0"
}