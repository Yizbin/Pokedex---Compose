package components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import data.pokemonList
import domain.Pokemon

@Composable
fun MenuPokedex(
    pokemonList: List<Pokemon>,
    innerPadding: PaddingValues,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier.padding(innerPadding)
    ) {
        items(pokemonList) { pokemon ->
            PokemonRow(pokemon = pokemon)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MenuPokedexPreview() {
    MenuPokedex(pokemonList = pokemonList, innerPadding = PaddingValues())
}