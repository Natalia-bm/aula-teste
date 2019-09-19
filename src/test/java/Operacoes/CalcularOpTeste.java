package Operacoes;

import org.junit.Assert;
import org.junit.Test;

public class CalcularOpTeste {
    @Test
    public void somarSucessoTeste(){
        CalcularOp calcularOp = new CalcularOp();
        Integer soma = calcularOp.somar(10,2);

        Assert.assertTrue(soma == 12);
    }

    @Test
    public void somarFalhaTeste(){
        CalcularOp calcularOp = new CalcularOp();
        Integer soma = calcularOp.somar(10,2);

        Assert.assertFalse(soma != 12);
    }

    @Test
    public void subSucessoTeste(){
        CalcularOp calcularOp = new CalcularOp();
        Integer sub = calcularOp.subtrair(10,2);

        Assert.assertTrue(sub == 8);
    }

    @Test
    public void subFalhaTeste(){
        CalcularOp calcularOp = new CalcularOp();
        Integer sub = calcularOp.subtrair(10,2);

        Assert.assertFalse(sub != 8);
    }

    @Test
    public void divSucessoTeste(){
        CalcularOp calcularOp = new CalcularOp();
        Integer div = calcularOp.dividir(10,2);

        Assert.assertTrue(div == 5);
    }

    @Test
    public void divFalhaTeste(){
        CalcularOp calcularOp = new CalcularOp();
        Integer div = calcularOp.dividir(10,2);

        Assert.assertFalse(div != 5);
    }

    @Test
    public void multSucessoTeste(){
        CalcularOp calcularOp = new CalcularOp();
        Integer mult = calcularOp.multiplicar(10,2);

        Assert.assertTrue(mult == 20);
    }

    @Test
    public void multFalhaTeste(){
        CalcularOp calcularOp = new CalcularOp();
        Integer mult = calcularOp.multiplicar(10,2);

        Assert.assertFalse(mult != 20);
    }

    @Test
    public void mediaSucessoTeste(){
        CalcularOp calcularOp = new CalcularOp();
        Integer media = calcularOp.media(10,2);

        Assert.assertTrue(media == 6);
    }

    @Test
    public void mediaFalhaTeste(){
        CalcularOp calcularOp = new CalcularOp();
        Integer media = calcularOp.media(10,2);

        Assert.assertFalse(media != 6);
    }
}
