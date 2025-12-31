package es.usal;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PersonaTest {

    @Test
    void fromString_ShouldReturnPersona_WhenInputIsValid() {
        // Arrange
        String input = "Juan,Garcia,25,juan@email.com";

        // Act
        Persona persona = Persona.fromString(input);

        // Assert
        assertNotNull(persona);
        assertEquals("Juan", persona.getNombre());
        assertEquals("Garcia", persona.getApellido());
        assertEquals(25, persona.getEdad());
        assertEquals("juan@email.com", persona.getEmail());
    }

    @Test
    void fromString_ShouldThrowException_WhenInputIsNull() {
        String input = null;
        assertThrows(IllegalArgumentException.class, () -> Persona.fromString(input));
    }
}