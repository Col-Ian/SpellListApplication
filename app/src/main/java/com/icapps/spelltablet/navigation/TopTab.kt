package com.icapps.spelltablet.navigation

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Checklist
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.outlined.AccountBox
import androidx.compose.material.icons.outlined.Checklist
import androidx.compose.material.icons.outlined.List
import androidx.compose.material3.Icon
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import com.icapps.spelltablet.components.textcomponents.TopTabText
import com.icapps.spelltablet.data.characterdata.CharacterEvent
import com.icapps.spelltablet.data.characterdata.CharacterState
import com.icapps.spelltablet.data.characterspelllist.CustomListEvent
import com.icapps.spelltablet.data.characterspelllist.CustomListState
import com.icapps.spelltablet.screens.CharacterScreen
import com.icapps.spelltablet.screens.CustomListScreen
import com.icapps.spelltablet.screens.SpellListScreen

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun TopTab(
    characterState: CharacterState,
    customListState: CustomListState,
    onEventCharacter: (CharacterEvent) -> Unit,
    onEventCustomList: (CustomListEvent) -> Unit
){
    // List for the top tabs
    val tabItems = listOf(
        TabItem(
            title = "Character",
            unselectedIcon = Icons.Outlined.AccountBox,
            selectedIcon = Icons.Filled.AccountBox,
            screenSelected = "CharacterScreen"
        ),
        TabItem(
            title = "Saved Spells",
            unselectedIcon = Icons.Outlined.Checklist,
            selectedIcon = Icons.Filled.Checklist,
            screenSelected = "CustomListScreen"
        ),
        TabItem(
            title = "Full List",
            unselectedIcon = Icons.Outlined.List,
            selectedIcon = Icons.Filled.List,
            screenSelected = "SpellListScreen"
        )
    )

    var selectedTabIndex by remember {
        mutableIntStateOf(0)
    }

    val pagerState = rememberPagerState {
        tabItems.size
    }

    LaunchedEffect(selectedTabIndex){
        pagerState.animateScrollToPage(selectedTabIndex)
    }
    // Use isScrollInProgress to prevent de-syncing if there's an animation for swiping when you click on a button instead.
    LaunchedEffect(pagerState.currentPage, pagerState.isScrollInProgress){
        if(!pagerState.isScrollInProgress) {
            selectedTabIndex = pagerState.currentPage
        }
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        TabRow(selectedTabIndex = selectedTabIndex) {
            tabItems.forEachIndexed{index, item ->
                Tab(
                    selected = index == selectedTabIndex,
                    onClick = {
                        selectedTabIndex = index
                    },
                    text = {
                        TopTabText(text = item.title)
                    },
                    icon = {
                        Icon(
                            imageVector = if(index == selectedTabIndex){
                               item.selectedIcon
                            } else item.unselectedIcon,
                            contentDescription = item.title
                        )
                    }
                )
            }
        }
        HorizontalPager(
            state = pagerState,
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {index ->
            Box(
                modifier = Modifier
                    .fillMaxSize(),
            ){
                if(tabItems[index].screenSelected == "CharacterScreen") {
                    CharacterScreen(
                        customListState = customListState,
                        characterState = characterState,
                        onCharacterEvent = onEventCharacter,
                        onCustomListEvent = onEventCustomList
                    )
                } else if (tabItems[index].screenSelected == "CustomListScreen"){
                    CustomListScreen(
                        customListState = customListState,
                        onEventCustomList = onEventCustomList
                    )
                }else{
                    SpellListScreen(
                        characterState = characterState,
                        customListState = customListState,
                        onEventCharacter = onEventCharacter,
                        onEventCustomList = onEventCustomList
                    )
                }
            }
        }
    }
}

data class TabItem(
    val title: String,
    val unselectedIcon: ImageVector,
    val selectedIcon: ImageVector,
    val screenSelected: String
)