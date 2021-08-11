import React, { useEffect, useState } from 'react';
import { SafeAreaView, ScrollView, StyleSheet, Text, View, TouchableOpacity, TextInput, FlatList } from 'react-native';

const Desafio = () => {
  const [count, setCount] = useState(0);
  const [nome, setNome] = useState('');
  const [nomeLista, setNomeLista] = useState([]);
  const [isActive, setIsActive] = useState(false);

  function Ativado() {
    setIsActive(!isActive);
  }

  function contador() {
    setCount(count + 1);
  }

  const Nomes = (nome) => {
    const nickname = nome;
    const data = {
      id: Math.random(),
      nome: nickname,
    };
    setNomeLista([...nomeLista, data]);
    console.log(nomeLista);
  };

  const [numEscolhido, setNumEscolhido] = useState(1);

  const [escolha, setEscolha] = useState('');
  const mudar = () => {
    setNumEscolhido(numEscolhido + 1);
    console.log({ numEscolhido });
    if (numEscolhido >= 5) {
      setNumEscolhido(1);
    }
    switch (numEscolhido) {
      case 1:
        return <Text>Opção 1</Text>;
        // setEscolha('Opção 1');
        break;
      case 2:
        setEscolha('Opção 2');
        break;
      case 3:
        setEscolha('Opção 3');
        break;
      case 4:
        setEscolha('Opção 4');
        break;
      case 5:
        setEscolha('Opção 5');
        break;
      default:
        setEscolha('Sorry, we are out of Fred');
    }
  };

  const Teste = () => {
    return <Text style={styles.texto}>{escolha}</Text>;
  };
  return (
    <>
      <View>
        <Text style={styles.number}>{count}</Text>
        <TouchableOpacity style={styles.button} onPress={contador}>
          <Text>Click Me Number</Text>
        </TouchableOpacity>
      </View>

      <View style={styles.textContainer}>
        <TextInput
          style={styles.input}
          placeholder="Digite seu nome"
          onChange={(evento) => setNome(evento.nativeEvent.text)}
        />
        <TouchableOpacity style={styles.button} onPress={() => Nomes(nome)}>
          <Text>Change Name</Text>
        </TouchableOpacity>
        {/* <Text>{nomeLista}</Text> */}
        <FlatList
          data={nomeLista}
          renderItem={({ item }) => (
            <View>
              <Text> {item.nome} </Text>
            </View>
          )}
          keyExtractor={(item) => item.id}
        />
      </View>

      <View style={styles.textContainer}>
        <TouchableOpacity style={styles.button} onPress={() => Ativado()}>
          <Text>Change option</Text>
        </TouchableOpacity>
        {isActive ? <Text style={styles.texto}>Primeira Opção</Text> : <Text style={styles.texto}> Segunda Opção</Text>}
      </View>

      {/* <View>
        <TextInput
          style={styles.input}
          onChange={evento => setNumEscolhido(evento.nativeEvent.text)}
        />
        <TouchableOpacity
          style={styles.button}
          onPress={() => mudar(numEscolhido)}>
          <Text>Enviar Opção</Text>
        </TouchableOpacity>
        <Teste />
      </View> */}

      <View>
        <TouchableOpacity style={styles.button} onPress={() => mudar()}>
          <Text>Change option</Text>
        </TouchableOpacity>
        <Teste />
      </View>
    </>
  );
};

const styles = StyleSheet.create({
  button: {
    alignItems: 'center',
    backgroundColor: '#DDDDDD',
    padding: 10,
  },
  number: {
    alignSelf: 'center',
    fontSize: 20,
  },
  textContainer: {
    marginTop: 20,
  },
  input: {
    height: 40,
    margin: 12,
    borderWidth: 1,
  },
  texto: {
    textAlign: 'center',
    fontSize: 20,
    marginTop: 20,
    marginBottom: 20,
  },
});

export default Desafio;
