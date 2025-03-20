package mate.academy.rickandmorty.dto.external;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import mate.academy.rickandmorty.model.Character;

@JsonIgnoreProperties(ignoreUnknown = true)
public record CharacterResponseDto(
        String id,
        String name,
        String status,
        String gender
) {
    public Character toCharacterEntity() {
        return Character.builder()
                .externalId(id())
                .name(name())
                .status(status())
                .gender(gender())
                .build();
    }
}
