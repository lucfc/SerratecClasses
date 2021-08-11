import React from 'react';
import {View, Text, StyleSheet} from 'react-native';

export const Home = () => {
  return (
    <View style={styles.home}>
      <Text style={styles.texto}>Outra pagina</Text>
      <Text style={styles.texto}>Outra pagina</Text>
      <Text style={styles.texto}>Outra pagina</Text>
    </View>
  );
};

const styles = StyleSheet.create({
  home: {
    flex: 1,
    flexDirection: 'row',
    justifyContent: 'space-around',
    backgroundColor: 'gray',
    height: 30,
    alignItems: 'center',
  },
});
