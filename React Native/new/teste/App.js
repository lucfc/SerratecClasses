import React from 'react';
import Navigation from './src/Navigation';
import {NavigationContainer} from '@react-navigation/native';
import {StatusBar} from 'react-native';

export default function App() {
  return (
    <NavigationContainer>
      <StatusBar barStyle="light-content" backgroundColor="#f8f8f8" />
      <Navigation />
    </NavigationContainer>
  );
}
