package com.example.spelllistapplication.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import com.example.spelllistapplication.data.SpellData
import com.example.spelllistapplication.data.SpellDataModel


// 1st layer completed as per demo
@Composable
fun SpellCard(
    modifier: Modifier = Modifier
) {
    Surface( modifier ){
        SpellBox()
    }
}

// Lazy Column
@Preview
@Composable
fun SpellBox(
    modifier: Modifier = Modifier
){
    LazyColumn(
        modifier = modifier
    ){
        items(items = SpellData.items, itemContent = {item ->
            SpellList(item)
        })
    }
}

//***********************************************************************************

// Each individual Spell card to display
@Composable
fun SpellList(
    item: SpellDataModel,
    modifier: Modifier = Modifier
){
    val expanded = remember { mutableStateOf(false) }

    Surface(
        color = MaterialTheme.colorScheme.primary,
        modifier = Modifier
            .padding(vertical = 4.dp, horizontal = 8.dp)
            .fillMaxWidth()
    ) {
        Column(
            modifier = modifier,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            if (expanded.value) {
                SpellFullDescription(item)
            } else {
                SpellPreview(item)
            }
            IconButton(onClick = { expanded.value = !expanded.value},
                modifier = Modifier
                    .background(MaterialTheme.colorScheme.secondary, shape = CircleShape)
                    .size(24.dp),
            ) {
                val arrowPointingDirection = if(expanded.value) Icons.Default.KeyboardArrowUp else Icons.Default.KeyboardArrowDown
                val arrowDescription = if ( expanded.value) "Show Less" else "Show More"
                Icon(imageVector = arrowPointingDirection, contentDescription = arrowDescription)
            }
        }
    }
}

// To display when the Spell is collapsed
@Composable
fun SpellPreview(item: SpellDataModel){
    Text(
        textAlign = TextAlign.Center,
        text = item.spellTitle
    )
    Text(text = item.spellPreviewDescription)
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Text(text = "Level ${item.spellLevel}")
            IconButton(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .background(
                        MaterialTheme.colorScheme.secondary,
                        shape = CircleShape
                    )
                    .size(24.dp),
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Add to character list"
                )
            }
        }
        Column {
            Text(text = item.spellClass)
            Text(text = "${item.spellSourceBookPreview} ${item.spellSourcePage}")
        }
    }
}

// To display when the Spell is expanded
@Composable
fun SpellFullDescription(item: SpellDataModel){
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {Text(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
        textAlign = TextAlign.Center,
        text = item.spellTitle
        )
        Text("Source: ${ item.spellSourceBookFull }")
        Text("Classes: ${item.spellClass} ${item.spellLevel}")
        Text("School: ${item.spellSchool}")
        Text("Casting Time: ${item.spellCastingTime}")
        Text("Range: ${item.spellRange}")
        Text("Targets: ${item.spellTargets}")
        Text("Duration: ${item.spellDuration}")
        Text("Saving Throw: ${item.spellSavingThrow}; Spell Resistance ${item.spellResistance}")
        Text("Description: ${item.spellDescriptionFull}")
        Box(contentAlignment = Alignment.BottomStart)
        {
            IconButton(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .background(
                        MaterialTheme.colorScheme.secondary,
                        shape = CircleShape
                    )
                    .size(24.dp),
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Add to character list"
                )
            }
        }

    }
}



