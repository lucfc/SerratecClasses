import React from 'react';
import {View, Text, TouchableOpacity} from 'react-native';
import LinearGradient from 'react-native-linear-gradient';

import {style} from './style';

import {Dashboard} from '../../components/dashboard';

export const Home = () => {
  return (
    <LinearGradient style={{flex: 1}} colors={['#1d6a53', '#1b2620']}>
      <View>
        <View style={style.containerHeader}>
          <Text style={style.textHeader}>LucBank</Text>
          <TouchableOpacity style={style.buttonNewTransaction}>
            <Text style={style.textButtonTransaction}>Nova Transação</Text>
          </TouchableOpacity>
        </View>
        <View style={style.dashboard}>
          <Dashboard />
        </View>
      </View>
    </LinearGradient>
  );
};
