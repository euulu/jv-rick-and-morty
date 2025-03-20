package mate.academy.rickandmorty.service;

import java.util.List;
import mate.academy.rickandmorty.dto.internal.CharacterDto;

public interface CharacterService {
    List<CharacterDto> getAll();

    CharacterDto getByName(String name);
}
