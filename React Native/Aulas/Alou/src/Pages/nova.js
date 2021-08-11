import React, { useState } from 'react';
import { Text, View, TouchableOpacity, StyleSheet } from 'react-native';

let estados = {
  valorTela: '',
  resultado: 0,
  operado: false,
  ponto: false,
};

const Calc = () => {
  const [verTela, setVerTela] = useState(estados.valorTela);
  const [verResultado, setVerResultado] = useState(estados.resultado);

  const addDigito = (digito) => {
    if ((digito == '+' || digito == '-' || digito == '*' || digito == '/') && estados.operado) {
      estados.valorTela = estados.resultado;
      estados.resultado = 0;
    }
    estados.valorTela = estados.valorTela + digito;
    setVerTela(estados.valorTela);
    setVerResultado(estados.resultado);
    estados.operado = false;
  };

  const limparTela = () => {
    estados = {
      valorTela: '',
      resultado: 0,
      operado: false,
      ponto: false,
    };
    setVerTela(estados.valorTela);
    setVerResultado(estados.verResultado);
  };

  const operar = () => {
    estados.resultado = eval(estados.valorTela);
    estados.operado = true;
    setVerResultado(estados.resultado);
  };
  return (
    <>
      <View style={styles.container}>
        <View style={styles.tela}>
          <Text style={styles.textoTela}>{verTela}</Text>
          <Text>{verResultado}</Text>
        </View>
        <View style={styles.fundo}>
          <TouchableOpacity
            style={styles.botao}
            onPress={() => {
              addDigito('.');
            }}
          >
            <Text style={styles.texto}>.</Text>
          </TouchableOpacity>
          <TouchableOpacity
            style={styles.botao}
            onPress={() => {
              addDigito('0');
            }}
          >
            <Text style={styles.texto}>0</Text>
          </TouchableOpacity>
          <TouchableOpacity
            style={styles.botao}
            onPress={() => {
              operar('=');
            }}
          >
            <Text style={styles.texto}>=</Text>
          </TouchableOpacity>
          <TouchableOpacity
            style={styles.botao}
            onPress={() => {
              addDigito('+');
            }}
          >
            <Text style={styles.texto}>+ </Text>
          </TouchableOpacity>
          <TouchableOpacity
            style={styles.botao}
            onPress={() => {
              addDigito('1');
            }}
          >
            <Text style={styles.texto}>1</Text>
          </TouchableOpacity>
          <TouchableOpacity
            style={styles.botao}
            onPress={() => {
              addDigito('2');
            }}
          >
            <Text style={styles.texto}>2</Text>
          </TouchableOpacity>
          <TouchableOpacity
            style={styles.botao}
            onPress={() => {
              addDigito('3');
            }}
          >
            <Text style={styles.texto}>3</Text>
          </TouchableOpacity>
          <TouchableOpacity
            style={styles.botao}
            onPress={() => {
              addDigito('-');
            }}
          >
            <Text style={styles.texto}>-</Text>
          </TouchableOpacity>
          <TouchableOpacity
            style={styles.botao}
            onPress={() => {
              addDigito('4');
            }}
          >
            <Text style={styles.texto}>4</Text>
          </TouchableOpacity>
          <TouchableOpacity
            style={styles.botao}
            onPress={() => {
              addDigito('5');
            }}
          >
            <Text style={styles.texto}>5</Text>
          </TouchableOpacity>
          <TouchableOpacity
            style={styles.botao}
            onPress={() => {
              addDigito('6');
            }}
          >
            <Text style={styles.texto}>6</Text>
          </TouchableOpacity>
          <TouchableOpacity
            style={styles.botao}
            onPress={() => {
              addDigito('*');
            }}
          >
            <Text style={styles.texto}>*</Text>
          </TouchableOpacity>
          <TouchableOpacity
            style={styles.botao}
            onPress={() => {
              addDigito('7');
            }}
          >
            <Text style={styles.texto}>7</Text>
          </TouchableOpacity>
          <TouchableOpacity
            style={styles.botao}
            onPress={() => {
              addDigito('8');
            }}
          >
            <Text style={styles.texto}>8</Text>
          </TouchableOpacity>
          <TouchableOpacity
            style={styles.botao}
            onPress={() => {
              addDigito('9');
            }}
          >
            <Text style={styles.texto}>9</Text>
          </TouchableOpacity>
          <TouchableOpacity
            style={styles.botao}
            onPress={() => {
              addDigito('/');
            }}
          >
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

export default Calc;
