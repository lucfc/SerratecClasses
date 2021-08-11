import React from 'react';
import {View, Text, Image} from 'react-native';
import {style} from './style';
import IconEntradas from '../../assets/icons/entradas.js';

export const Dashboard = () => {
  return (
    <View style={style.container}>
      <View style={style.containerDashboard}>
        <View style={style.headerDashboard}>
          <Text style={style.textDashboard}>Entradas</Text>
          <View style={style.IconDashboard}>
            <IconEntradas widht={40} height={40} />
          </View>
        </View>
        <View>
          <Text>Valor</Text>
        </View>
      </View>
    </View>
  );
};
