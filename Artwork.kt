package com.example.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.artspace.ui.theme.ArtSpaceTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.Alignment
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.Button
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Art()
                }
            }
        }
    }
}
@Composable
fun Image() {
    Image(painter = painterResource(R.drawable.art),
        contentDescription = null,
    )
}
@Composable
fun Title(title: String,
          modifier: Modifier = Modifier  )
{
    Text(
        text = title,
        modifier = Modifier.padding(bottom = 16.dp),
        fontWeight = FontWeight.Bold
    )

}
@Composable
fun Subtitle(subtitle: String,
             modifier: Modifier ) {
    Text(
        text = subtitle,
        modifier = Modifier.padding(bottom = 16.dp)
    )
}

fun Text(text: String, shape: Any?) {

}





@Composable
fun Art(modifier: Modifier = Modifier) {
    Column(modifier = modifier
        .fillMaxSize()
        .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image()
        Spacer(modifier = Modifier.padding(16.dp))
        Title(
            title = stringResource(R.string.title),
            modifier = Modifier.weight(1f)
        )
        Spacer(modifier = Modifier.padding(16.dp))
        Subtitle(
            subtitle = stringResource(R.string.subtitle),
            modifier = Modifier.weight(1f)
        )
        Button(onClick = { /*TODO*/ }) {
            Text(stringResource(R.string.previous))

        }


    }

}
@Preview(showBackground = true)
@Composable
fun ArtSpacePreview() {
    ArtSpaceTheme {
        Art()
    }
}
