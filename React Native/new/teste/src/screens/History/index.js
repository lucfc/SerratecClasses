import React from 'react';
import {Text, View, Image} from 'react-native';
import {styles} from './styles';

export default function History() {
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
        <Text style={styles.Top}>Histórico</Text>
        <Image style={styles.EAQ} source={require('../../pics/logo.png')} />
      </View>

      <View
        style={{
          height: '90%',
          alignItems: 'center',
          marginBottom: 10,
        }}>
        <View
          style={{
            alignItems: 'center',
          }}>
          <View style={{backgroundColor: '#edebec', width: 300, height: 150}}>
            <View style={{flexDirection: 'row'}}>
              <View
                style={{
                  alignItems: 'center',
                  width: '80%',
                  paddingTop: 5,
                }}>
                <Text>Claro</Text>
              </View>
              <Image
                style={{width: 20, height: 20, marginLeft: 40, marginTop: 5}}
                source={require('../../pics/quest.png')}
              />
            </View>

            <View
              style={{flexDirection: 'row', justifyContent: 'space-between'}}>
              <View style={styles.Caixa1}>
                <View style={{}}>
                  <Image
                    style={{width: 26, height: 17}}
                    source={require('../../pics/down.png')}
                  />
                  <Text>175.69</Text>
                  <Text>Mbps</Text>
                </View>
                <View style={{}}>
                  <Image
                    style={{width: 26, height: 17}}
                    source={require('../../pics/up.png')}
                  />
                  <Text>14.20</Text>
                  <Text>Mbps</Text>
                </View>
              </View>

              <View style={styles.Caixa2}>
                <View
                  style={{
                    flexDirection: 'row',
                    justifyContent: 'space-between',
                  }}>
                  <Text>Latência</Text>
                  <Text>22 ms</Text>
                </View>
                <View
                  style={{
                    flexDirection: 'row',
                    justifyContent: 'space-between',
                  }}>
                  <Text>Jitter</Text>
                  <Text>11 ms</Text>
                </View>
                <View
                  style={{
                    flexDirection: 'row',
                    justifyContent: 'space-between',
                  }}>
                  <Text>Perda de Pacotes</Text>
                  <Text>0 %</Text>
                </View>
                <View
                  style={{
                    flexDirection: 'row',
                    justifyContent: 'space-between',
                  }}>
                  <Text>Data</Text>
                  <Text>18/06/2021 10:38</Text>
                </View>
                <View
                  style={{
                    flexDirection: 'row',
                    justifyContent: 'space-between',
                  }}>
                  <Text>Tipo de Rede</Text>
                  <Text>wifi</Text>
                </View>
              </View>
            </View>
          </View>
        </View>

        <View style={{justifyContent: 'center', alignItems: 'center'}}>
          <View style={{backgroundColor: '#edebec', width: 300, height: 150}}>
            <View style={{flexDirection: 'row'}}>
              <View
                style={{
                  alignItems: 'center',
                  width: '80%',
                  paddingTop: 5,
                }}>
                <Text>Claro</Text>
              </View>
              <Image
                style={{width: 20, height: 20, marginLeft: 40, marginTop: 5}}
                source={require('../../pics/quest.png')}
              />
            </View>

            <View
              style={{flexDirection: 'row', justifyContent: 'space-between'}}>
              <View style={styles.Caixa1}>
                <View style={{}}>
                  <Image
                    style={{width: 26, height: 17}}
                    source={require('../../pics/down.png')}
                  />
                  <Text>175.69</Text>
                  <Text>Mbps</Text>
                </View>
                <View style={{}}>
                  <Image
                    style={{width: 26, height: 17}}
                    source={require('../../pics/up.png')}
                  />
                  <Text>14.20</Text>
                  <Text>Mbps</Text>
                </View>
              </View>

              <View style={styles.Caixa2}>
                <View
                  style={{
                    flexDirection: 'row',
                    justifyContent: 'space-between',
                  }}>
                  <Text>Latência</Text>
                  <Text>22 ms</Text>
                </View>
                <View
                  style={{
                    flexDirection: 'row',
                    justifyContent: 'space-between',
                  }}>
                  <Text>Jitter</Text>
                  <Text>11 ms</Text>
                </View>
                <View
                  style={{
                    flexDirection: 'row',
                    justifyContent: 'space-between',
                  }}>
                  <Text>Perda de Pacotes</Text>
                  <Text>0 %</Text>
                </View>
                <View
                  style={{
                    flexDirection: 'row',
                    justifyContent: 'space-between',
                  }}>
                  <Text>Data</Text>
                  <Text>18/06/2021 10:38</Text>
                </View>
                <View
                  style={{
                    flexDirection: 'row',
                    justifyContent: 'space-between',
                  }}>
                  <Text>Tipo de Rede</Text>
                  <Text>wifi</Text>
                </View>
              </View>
            </View>
          </View>
        </View>
      </View>
    </View>
  );
}
