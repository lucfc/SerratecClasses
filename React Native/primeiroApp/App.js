import React, {Component, useState} from 'react';
import {
  Platform,
  Text,
  View,
  StyleSheet,
  ScrollView,
  Linking,
  Image,
  TouchableOpacity,
} from 'react-native';
import {Home} from './src/Components/Home';
import image from './src/Assets/Wallpaper2.jpg';
import Page from './src/Pages/page';

const App = () => {
  const [count, setCount] = useState(0);

  function contador() {
    setCount(count + 1);
  }
  return (
    <ScrollView>
      <View style={styles.container}>
        <View style={styles.header}>
          <Image style={styles.images} source={image} />
        </View>
      </View>
      <Home style={styles.home} />
      <View style={styles.main}>
        <View style={styles.mainContent}>
          <TouchableOpacity style={styles.button} onPress={contador}>
            <Text>Click Me</Text>
          </TouchableOpacity>
          <Text>{count}</Text>
        </View>
      </View>
    </ScrollView>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    flexDirection: 'column',
    backgroundColor: '#f5fcff',
  },
  images: {
    resizeMode: 'cover',
    width: '100%',
    height: 200,
  },

  header: {
    flex: 1,
    flexDirection: 'row',
    justifyContent: 'space-between',
    alignItems: 'center',
    backgroundColor: '#377478',
    width: '100%',
    height: 100,
  },
  main: {
    backgroundColor: '#32403b',
    height: 450,
    alignItems: 'center',
  },
  mainContent: {
    backgroundColor: 'white',
    width: '90%',
    alignItems: 'center',
    marginTop: 20,
    height: 400,
    borderRadius: 20,
  },
  button: {
    alignItems: 'center',
    backgroundColor: '#DDDDDD',
    padding: 10,
  },
});

export default App;
