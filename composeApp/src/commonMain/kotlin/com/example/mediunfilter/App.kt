package com.example.mediunfilter

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import mediunfilter.composeapp.generated.resources.Res
import mediunfilter.composeapp.generated.resources.back_arrow
import mediunfilter.composeapp.generated.resources.icon_account
import mediunfilter.composeapp.generated.resources.icon_cart
import mediunfilter.composeapp.generated.resources.icon_star_filled
import mediunfilter.composeapp.generated.resources.icon_star_unfilled
import mediunfilter.composeapp.generated.resources.category_snacks
import mediunfilter.composeapp.generated.resources.category_meal
import mediunfilter.composeapp.generated.resources.category_vegan
import mediunfilter.composeapp.generated.resources.category_dessert
import mediunfilter.composeapp.generated.resources.category_drinks
import mediunfilter.composeapp.generated.resources.bottom_home
import mediunfilter.composeapp.generated.resources.bottom_search
import mediunfilter.composeapp.generated.resources.bottom_star
import mediunfilter.composeapp.generated.resources.bottom_cart
import mediunfilter.composeapp.generated.resources.bottom_profile

@Composable
@Preview
fun App() {
    MaterialTheme {
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF5CB58)),
            color = Color(0xFFF5CB58)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 24.dp)
            ) {
                Spacer(Modifier.height(24.dp))
                // Top Bar
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(Res.drawable.back_arrow),
                        contentDescription = null,
                        modifier = Modifier.size(13.dp)
                    )
                    Text(
                        text = "Filter",
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFF8F8F8)
                    )
                    Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                        Image(
                            painter = painterResource(Res.drawable.icon_cart),
                            contentDescription = null,
                            modifier = Modifier.size(26.dp)
                        )
                        Image(
                            painter = painterResource(Res.drawable.icon_account),
                            contentDescription = null,
                            modifier = Modifier.size(26.dp)
                        )
                    }
                }

                Spacer(Modifier.height(24.dp))

                // Categories title
                Text(
                    text = "Categories",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color(0xFF391713)
                )

                Spacer(Modifier.height(12.dp))

                // Category icons row per Figma
                Row(horizontalArrangement = Arrangement.spacedBy(13.dp), verticalAlignment = Alignment.CenterVertically) {
                    CategoryIcon(label = "Snacks", resId = Res.drawable.category_snacks, selected = false)
                    CategoryIcon(label = "Meal", resId = Res.drawable.category_meal, selected = false)
                    CategoryIcon(label = "Vegan", resId = Res.drawable.category_vegan, selected = false)
                    CategoryIcon(label = "Dessert", resId = Res.drawable.category_dessert, selected = true)
                    CategoryIcon(label = "Drinks", resId = Res.drawable.category_drinks, selected = false)
                }

                Spacer(Modifier.height(24.dp))
                DividerLine()

                Spacer(Modifier.height(16.dp))
                Text(
                    text = "Sort by",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color(0xFF391713)
                )
                Spacer(Modifier.height(8.dp))

                Row(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                    Text(
                        text = "Top Rated",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Light,
                        color = Color(0xFF391713)
                    )

                    repeat(4) {
                        Image(
                            painter = painterResource(Res.drawable.icon_star_filled),
                            contentDescription = null,
                            modifier = Modifier.size(19.dp)
                        )
                    }

                    Image(
                        painter = painterResource(Res.drawable.icon_star_unfilled),
                        contentDescription = null,
                        modifier = Modifier.size(19.dp)
                    )
                }

                Spacer(Modifier.height(24.dp))
                DividerLine()

                Spacer(Modifier.height(16.dp))
                Text(
                    text = "Categories",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color(0xFF391713)
                )
                Spacer(Modifier.height(8.dp))

                // Dessert categories grid per Figma
                Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
                    Row(horizontalArrangement = Arrangement.spacedBy(30.dp)) {
                        CategoryChip(label = "Crepes", selected = false)
                        CategoryChip(label = "Macarons", selected = false)
                        CategoryChip(label = "Cupcakes", selected = true)
                    }
                    Row(horizontalArrangement = Arrangement.spacedBy(30.dp)) {
                        CategoryChip(label = "Ice Cream", selected = false)
                        CategoryChip(label = "Flan", selected = false)
                        CategoryChip(label = "Cheesecake", selected = false)
                    }
                    Row(horizontalArrangement = Arrangement.spacedBy(30.dp)) {
                        CategoryChip(label = "Chocolate", selected = true)
                        CategoryChip(label = "Cakes", selected = false)
                        CategoryChip(label = "Brownie", selected = false)
                    }
                }

                Spacer(Modifier.height(16.dp))
                Text(
                    text = "Price",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color(0xFFE95322)
                )
                Spacer(Modifier.height(36.dp))
                PriceSlider()

                Spacer(Modifier.height(36.dp))

                // Apply button
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(26.dp))
                        .background(Color(0xFFE95322))
                        .padding(vertical = 10.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Apply",
                        fontSize = 23.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.White
                    )
                }

                Spacer(Modifier.height(12.dp))

                // Bottom navigation bar
                BottomNavigationBar()

                Spacer(Modifier.height(24.dp))
            }
        }
    }
}

@Composable
private fun CategoryChip(label: String, selected: Boolean) {
    val background = if (selected) Color(0xFFE95322) else Color(0xFFFFDECF)
    val textColor = if (selected) Color.White else Color(0xFFE95322)
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(33.dp))
            .background(background)
            .padding(horizontal = 14.dp, vertical = 6.dp)
    ) {
        Text(
            text = label,
            fontSize = 14.sp,
            fontWeight = if (selected) FontWeight.Medium else FontWeight.Normal,
            color = textColor
        )
    }
}

@Composable
private fun CategoryIcon(label: String, resId: org.jetbrains.compose.resources.DrawableResource, selected: Boolean) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Box(
            modifier = Modifier
                .size(62.dp)
                .clip(RoundedCornerShape(30.dp))
                .background(if (selected) Color(0xFFF5CB58) else Color(0xFFF3E9B5)),
            contentAlignment = Alignment.Center
        ) {
            Image(painter = painterResource(resId), contentDescription = null, modifier = Modifier.size(37.dp))
        }
        Spacer(Modifier.height(6.dp))
        Text(
            text = label,
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
            color = Color(0xFF391713)
        )
    }
}

@Composable
private fun DividerLine() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(1.dp)
            .background(Color(0xFFFFD8C7))
    )
}

@Composable
private fun PriceSlider() {
    // Simplified static slider visual per design
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(24.dp)
    ) {
        Box(
            modifier = Modifier
                .align(Alignment.CenterStart)
                .fillMaxWidth()
                .height(8.dp)
                .clip(RoundedCornerShape(54.dp))
                .background(Color(0xFFD9D9D9))
        )
        Box(
            modifier = Modifier
                .align(Alignment.CenterStart)
                .width(203.dp)
                .height(11.dp)
                .clip(RoundedCornerShape(54.dp))
                .background(Color(0xFFE95322))
        )
    }
    Spacer(Modifier.height(8.dp))
    Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()) {
        Text("$1", fontSize = 14.sp, fontWeight = FontWeight.Light, color = Color(0xFF391713))
        Text("$10", fontSize = 14.sp, fontWeight = FontWeight.Light, color = Color(0xFF391713))
        Text("$50", fontSize = 14.sp, fontWeight = FontWeight.Light, color = Color(0xFF391713))
        Text("$100 >", fontSize = 14.sp, fontWeight = FontWeight.Light, color = Color(0xFF391713))
    }
}

@Composable
private fun BottomNavigationBar() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp))
            .background(Color(0xFFE95322))
            .padding(vertical = 10.dp, horizontal = 28.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(painter = painterResource(Res.drawable.bottom_home), contentDescription = null, modifier = Modifier.size(24.dp))
            Image(painter = painterResource(Res.drawable.bottom_search), contentDescription = null, modifier = Modifier.size(24.dp))
            Image(painter = painterResource(Res.drawable.bottom_star), contentDescription = null, modifier = Modifier.size(24.dp))
            Image(painter = painterResource(Res.drawable.bottom_cart), contentDescription = null, modifier = Modifier.size(24.dp))
            Image(painter = painterResource(Res.drawable.bottom_profile), contentDescription = null, modifier = Modifier.size(24.dp))
        }
    }
}