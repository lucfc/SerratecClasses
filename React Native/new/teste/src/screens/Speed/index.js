import React from 'react';
import {Text, View, Image} from 'react-native';
import {styles} from './styles';

export default function Speed() {
  return (
    <View style={styles.Container}>
      <View
        style={{
          backgroundColor: '#136f9c',
          flexDirection: 'row',
          justifyContent: 'space-between',
        }}>
        <Image
          style={styles.Anatel}
          source={require('../../pics/anatel.png')}
        />
        <Text style={styles.Top}>Velocímetro</Text>
        <Image style={styles.EAQ} source={require('../../pics/logo.png')} />
      </View>
      <View>
        <Text style={styles.Title}>Aguardando Início do Teste</Text>
        <Image
          style={styles.Speedometer}
          source={require('../../pics/template.png')}
        />
      </View>

      <View style={{flex: 1, justifyContent: 'center', alignItems: 'center'}}>
        <View style={{backgroundColor: '#edebec', width: 400, height: 150}}>
          <View style={{flexDirection: 'row'}}>
            <View
              style={{
                alignItems: 'center',
                width: '90%',
              }}>
              <Text>Claro</Text>
            </View>
            <Image
              style={{width: 20, height: 20, alignItems: 'flex-end'}}
              source={require('../../pics/quest.png')}
            />
          </View>

          <View
            style={{
              flexDirection: 'row',
              justifyContent: 'space-between',
              width: '100%',
            }}>
            <View style={styles.Caixa1}>
              <View style={{}}>
                <Image
                  style={{width: 20, height: 20}}
                  source={require('../../pics/down.png')}
                />
                <Text>0.00</Text>
                <Text>Mbps</Text>
              </View>
              <View style={{}}>
                <Image
                  style={{width: 20, height: 20}}
                  source={require('../../pics/up.png')}
                />
                <Text>0.00</Text>
                <Text>Mbps</Text>
              </View>
            </View>

            <View style={styles.Caixa2}>
              <View
                style={{flexDirection: 'row', justifyContent: 'space-between'}}>
                <Text>Latência</Text>
                <Text>0 ms</Text>
              </View>
              <View
                style={{flexDirection: 'row', justifyContent: 'space-between'}}>
                <Text>Jitter</Text>
                <Text>0 ms</Text>
              </View>
              <View
                style={{flexDirection: 'row', justifyContent: 'space-between'}}>
                <Text>Perda de Pacotes</Text>
                <Text>0 %</Text>
              </View>
              <View
                style={{flexDirection: 'row', justifyContent: 'space-between'}}>
                <Text>Tipo de Rede</Text>
                <Text>wifi</Text>
              </View>
            </View>
          </View>
        </View>
      </View>

      <View>
        <Text style={styles.Press}>INICIAR TESTE</Text>
      </View>
    </View>
  );
}
