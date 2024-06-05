package royerdavid.pokedex.features.pokemons.presentation

import androidx.compose.runtime.Immutable
import royerdavid.pokedex.features.pokemons.domain.model.PokemonSummary

@Immutable
data class PokemonListUiState(
    val emptyStateText: String = "",
    val isLoading: Boolean = false,
    val pokemonSummaryList: List<PokemonSummary> = emptyList()
)
