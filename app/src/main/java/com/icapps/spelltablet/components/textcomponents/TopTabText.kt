package com.icapps.spelltablet.components.textcomponents

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableDoubleStateOf
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun TopTabText(
    text: String,
){
//    var resizedTextStyle = 16.0
    var resizedTextStyle by remember{
        mutableFloatStateOf(16f)
    }
    // Draw only when scaling is finished
    var shouldDraw by remember {
        mutableStateOf(false)
    }
    Text(
        modifier = Modifier
            .drawWithContent {
            if(shouldDraw){
                drawContent()
            }
        },
        style = TextStyle(
            fontSize = resizedTextStyle.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Normal
        ),
        text = text,
        // Auto Scaling for smaller devices.
        softWrap = false,
        onTextLayout = { result ->
            // Check if it overflowed.
            if(result.didOverflowWidth){
                // Make text smaller
                resizedTextStyle *= 0.90f
            } else {
                shouldDraw = true
            }
        }
    )
}