import {StyleSheet} from 'react-native';

export const styles = StyleSheet.create({
  Container: {
    backgroundColor: '#f8f8f8',
    flex: 1,
  },

  Anatel: {
    width: 44,
    height: 44,
    marginTop: 5,
    marginLeft: 5,
  },

  EAQ: {
    width: 60,
    height: 30,
    marginTop: 14,
    marginRight: 5,
  },

  Top: {
    backgroundColor: '#136f9c',
    borderColor: '#e4e4e4',
    padding: 15,
    color: '#ffffff',
    textAlign: 'center',
    fontSize: 18,
    fontWeight: 'bold',
  },

  Title: {
    color: '#999999',
    textAlign: 'center',
    fontWeight: 'bold',
    fontSize: 22,
    marginTop: 33,
  },

  Speedometer: {
    width: 240,
    height: 150,
    marginTop: 20,
    alignSelf: 'center',
  },

  Result: {
    backgroundColor: '#f8f8f8',
    marginTop: 20,
    marginRight: 20,
    marginLeft: 20,
    padding: 15,
    borderColor: '#e4e4e4',
    borderWidth: 1,
    textAlign: 'center',
  },

  Caixa1: {
    flexDirection: 'row',
    width: '50%',
    justifyContent: 'space-evenly',
    marginTop: 20,
    height: 100,
    alignItems: 'center',
  },

  Caixa2: {
    flexDirection: 'column',
    width: '50%',
    marginTop: 20,
    height: 100,

    paddingRight: 5,
    // alignItems: 'center',
  },

  ResultTop: {
    backgroundColor: '#edebec',
    alignItems: 'center',
    width: '80%',
  },

  Press: {
    backgroundColor: '#e27d07',
    color: 'white',
    fontWeight: 'bold',
    textAlign: 'center',
    marginTop: 5,
    marginRight: 20,
    marginLeft: 20,
    padding: 10,
    borderColor: '#e4e4e4',
    borderWidth: 1,
  },
});
