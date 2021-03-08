package com.manuelduarte077.kotlinjetpackcompose

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            PersonalData(name = "Manuel")
        }

    }

    @Composable
    private fun PersonalData(name: String) {

        MaterialTheme() {
            Column(
                modifier = Modifier.padding(16.dp).fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(R.drawable._a49165e_o),
                    contentDescription = "Manuel Duarte",
                    modifier = Modifier.height(150.dp),
                )
                
                Spacer(modifier = Modifier.height(16.dp))
                
                Text(text = "Mi nombre es $name", style = MaterialTheme.typography.h6)
                Text(text = "manuelduarte077")
                Text(text = "Hacker")
            }
        }
        
    }

    @Preview
    @Composable
    fun PreviewPersonalData() {
        PersonalData(name = "Manuel")
    }

}

