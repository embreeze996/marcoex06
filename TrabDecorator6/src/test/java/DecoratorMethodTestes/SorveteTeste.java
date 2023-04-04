package DecoratorMethodTestes;

import DecoratorMethod.Sorvete;
import DecoratorMethod.SorveteFrutasCrista;
import DecoratorMethod.SorveteGranulado;
import DecoratorMethod.SorvetePrecoTotal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CursoTest {

    @Test
    void deveRetornarPrecoSorvete() {
        Sorvete sorvete = new SorvetePrecoTotal(10.0f);

        assertEquals(10.0f, sorvete.getPreco());
    }

    @Test
    void deveRetornarPrecoSorveteComGranulado() {
        Sorvete sorvete = new SorveteGranulado(new SorvetePrecoTotal(10.0f));

        assertEquals(13.0f, sorvete.getPreco());
    }

    @Test
    void deveRetornarPrecoSorveteComFrutasCrista() {
        Sorvete sorvete = new SorveteFrutasCrista(new SorvetePrecoTotal(10.0f));

        assertEquals(15.0f, sorvete.getPreco());
    }
    @Test
    void deveRetornarPrecoSorveteComFrutasCristaMaisSorveteGranulado() {
        Sorvete sorvete = new SorveteFrutasCrista(new SorveteGranulado(new SorvetePrecoTotal(10.0f)));

        assertEquals(18.0f, sorvete.getPreco());
    }

    @Test
    void deveRetornarExtra() {
        Sorvete sorvete = new SorvetePrecoTotal();

        assertEquals("Preço Total", sorvete.getExtra());
    }

    @Test
    void deveRetornarExtraComGranulado() {
        Sorvete sorvete = new SorveteGranulado(new SorvetePrecoTotal());

        assertEquals("Sorvete básico/Granulados", sorvete.getExtra());
    }

    @Test
    void deveRetornarExtraComFrutasCristalizadas() {
       Sorvete sorvete = new SorveteFrutasCrista(new SorvetePrecoTotal());

        assertEquals("Sorvete básico/Frutas cristalizadas", sorvete.getExtra());
    }
    @Test
    void deveRetornarExtraComFrutasCristalizadasMaisGranulado() {
        Sorvete sorvete = new SorveteFrutasCrista(new SorveteGranulado (new SorvetePrecoTotal()));

        assertEquals("Sorvete básico/Granulados/Frutas cristalizadas", sorvete.getExtra());
    }
}
