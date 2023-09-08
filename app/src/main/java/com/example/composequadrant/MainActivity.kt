package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Quadrant()
                }
            }
        }
    }
}

@Composable
fun Quadrant() {
    Column(Modifier.fillMaxWidth()){
        Row(modifier = Modifier.weight(1f)){
            QuadrantCard(stringResource(id = R.string.heading1),stringResource(id = R.string.content1), Color(0xFFEADDFF), modifier = Modifier.weight(1f))
            QuadrantCard(stringResource(id = R.string.heading2),stringResource(id = R.string.content2), Color(0xFFD0BCFF), modifier = Modifier.weight(1f))
        }
        Row(modifier = Modifier.weight(1f)){
            QuadrantCard(stringResource(id = R.string.heading3),stringResource(id = R.string.content3), Color(0xFFB69DF8), modifier = Modifier.weight(1f))
            QuadrantCard(stringResource(id = R.string.heading4),stringResource(id = R.string.content4), Color(0xFFF6EDFF), modifier = Modifier.weight(1f))
        }
    }
}
@Composable
fun QuadrantCard(heading: String, content: String, color: Color,modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.background(color).padding(16.dp).fillMaxSize(),
    ){
        Text(
            text = heading,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = content,
            textAlign = TextAlign.Justify,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeQuadrantTheme {
        Quadrant()
    }
}