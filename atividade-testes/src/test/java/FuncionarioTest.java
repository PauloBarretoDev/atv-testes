import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class FuncionarioTest {

    @Test
    public void testAumentarSalarioComBaseVendas() {
        // Mock
        Funcionario funcionarioMock = mock(Funcionario.class);

        // When
        when(funcionarioMock.aumentarSalarioComBaseVendas(1000.0,100,0.1)).thenReturn(1010.0);

        double resultado = funcionarioMock.aumentarSalarioComBaseVendas(1000.0,100,0.1);
        System.out.println(resultado);

        // Verify
        verify(funcionarioMock).aumentarSalarioComBaseVendas(1000.0,100,0.1);

        assertEquals(1010, resultado);
    }

    @Test
    public void testEleitoAFerias(){
        //Mock
        Funcionario funcionarioMock = mock(Funcionario.class);

        // When
        when(funcionarioMock.eleitoTirarFerias("2022-01-01")).thenReturn(true);

        boolean resultado = funcionarioMock.eleitoTirarFerias("2022-01-01");
        System.out.println(resultado);

        // Verify
        verify(funcionarioMock).eleitoTirarFerias("2022-01-01");

        assertEquals(true,resultado);
    }

    @Test
    public void testVenderFerias(){
        //Mock
        Funcionario funcionarioMock = mock(Funcionario.class);

        // When
        when(funcionarioMock.venderFerias(1000.0,10)).thenReturn(1333.3);
        double resultado = funcionarioMock.venderFerias(1000.0,10);
        System.out.println(resultado);

        // Verify
        verify(funcionarioMock).venderFerias(1000.0,10);

        assertEquals(1333.3,resultado);
    }

}
