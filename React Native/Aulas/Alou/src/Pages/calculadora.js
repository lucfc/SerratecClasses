import React, {Children, useState} from 'react';
import {Text, View, TouchableOpacity, StyleSheet} from 'react-native';

const Calculadora = () => {
  const [numero, setNumero] = useState(0);
  const [numeros, setNumeros] = useState([]);
  const [numeros2, setNumeros2] = useState([]);

  const mostrarTela = numero => {
    setNumeros([...numeros, numero]);
    console.log(numeros);
    if (numero === '+') {
      setNumeros2(...numeros);
      setNumeros([]);
    }
  };

  const soma = (numeros, numeros2) => {
    const soma = numeros + numeros2;
    return soma;
  };

  return (
    <>
      <View style={styles.container}>
        <View style={styles.tela}>
          {/* <Text style={styles.textoTela}>{numero}</Text> */}
          <Text style={styles.textoTela}>{numeros}</Text>
          <Text>{soma(numeros, numeros2)}</Text>
        </View>
        <View style={styles.fundo}>
          <TouchableOpacity
            style={styles.botao}
            onPress={(() => setSimbolo('.'), () => mostrarTela('.'))}>
            <Text style={styles.texto}>.</Text>
          </TouchableOpacity>
          <TouchableOpacity
            style={styles.botao}
            onPress={(() => setNumero(0), () => mostrarTela(0))}>
            <Text style={styles.texto}>0</Text>
          </TouchableOpacity>
          <TouchableOpacity
            style={styles.botao}
            onPress={() => setSimbolo('=')}>
            <Text style={styles.texto}>=</Text>
          </TouchableOpacity>
          <TouchableOpacity
            style={styles.botao}
            onPress={(() => setNumero('+'), () => mostrarTela('+'))}>
            <Text style={styles.texto}>+ </Text>
          </TouchableOpacity>
          <TouchableOpacity
            style={styles.botao}
            onPress={() => setNumero(1)}
            onPress={() => mostrarTela(1)}>
            <Text style={styles.texto}>1</Text>
          </TouchableOpacity>
          <TouchableOpacity style={styles.botao} onPress={() => setNumero(2)}>
            <Text style={styles.texto}>2</Text>
          </TouchableOpacity>
          <TouchableOpacity style={styles.botao} onPress={() => setNumero(3)}>
            <Text style={styles.texto}>3</Text>
          </TouchableOpacity>
          <TouchableOpacity style={styles.botao} onPress={() => setNumero('-')}>
            <Text style={styles.texto}>-</Text>
          </TouchableOpacity>
          <TouchableOpacity style={styles.botao} onPress={() => setNumero(4)}>
            <Text style={styles.texto}>4</Text>
          </TouchableOpacity>
          <TouchableOpacity style={styles.botao} onPress={() => setNumero(5)}>
            <Text style={styles.texto}>5</Text>
          </TouchableOpacity>
          <TouchableOpacity style={styles.botao} onPress={() => setNumero(6)}>
            <Text style={styles.texto}>6</Text>
          </TouchableOpacity>
          <TouchableOpacity style={styles.botao} onPress={() => setNumero('*')}>
            <Text style={styles.texto}>*</Text>
          </TouchableOpacity>
          <TouchableOpacity style={styles.botao} onPress={() => setNumero(7)}>
            <Text style={styles.texto}>7</Text>
          </TouchableOpacity>
          <TouchableOpacity style={styles.botao} onPress={() => setNumero(8)}>
            <Text style={styles.texto}>8</Text>
          </TouchableOpacity>
          <TouchableOpacity style={styles.botao} onPress={() => setNumero(9)}>
            <Text style={styles.texto}>9</Text>
          </TouchableOpacity>
          <TouchableOpacity style={styles.botao} onPress={() => setNumero('/')}>
            <Text style={styles.texto}>/</Text>
          </TouchableOpacity>
        </View>
      </View>
    </>
  );
};

const styles = StyleSheet.create({
  container: {
    height: '100%',
  },
  textoTela: {
    fontSize: 100,
  },
  tela: {
    height: '50%',
  },
  fundo: {
    flexDirection: 'row',
    justifyContent: 'space-around',
    flexWrap: 'wrap-reverse',
    width: '100%',
    // alignItems: 'baseline',
    height: '50%',
  },
  botao: {
    backgroundColor: 'gray',
    borderColor: 'black',
    borderWidth: 0.5,
    width: 105,
    height: 100,
    alignItems: 'center',
    justifyContent: 'center',
  },
  texto: {
    fontSize: 20,
  },
});

export default Calculadora;
