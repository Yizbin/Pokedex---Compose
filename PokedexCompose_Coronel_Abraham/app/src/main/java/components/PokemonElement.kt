package components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import data.bulbasaur
import domain.Pokemon
import itson.pokedexcompose.coronel.abraham.ui.theme.Green

@Composable
fun PokemonRow(pokemon: Pokemon, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = pokemon.imagen),
            contentDescription = "${pokemon.nombre} image",
            modifier = Modifier
                .width(80.dp)
                .padding(10.dp)
        )

        Column(
            modifier = Modifier.fillMaxWidth(0.7f),
            verticalArrangement = Arrangement.spacedBy(2.dp)
        ) {
            Text(
                text = pokemon.nombre,
                style = MaterialTheme.typography.labelLarge
            )

            Text(
                text = pokemon.descripcion,
                fontSize = 10.sp
            )

            Row(
                modifier = Modifier.fillMaxWidth(0.85f),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Height: ${pokemon.altura}",
                    style = MaterialTheme.typography.labelMedium
                )
                Text(
                    text = "Weight: ${pokemon.peso}",
                    style = MaterialTheme.typography.labelMedium
                )
            }
        }

        Text(
            text = "${pokemon.numero}",
            color = MaterialTheme.colorScheme.onPrimary,
            modifier = Modifier
                .align(Alignment.Top)
                .background(Green)
                .padding(horizontal = 5.dp, vertical = 2.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PokemonRowPreview() {
    PokemonRow(pokemon = bulbasaur)
}