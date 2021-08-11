import {StyleSheet} from 'react-native';

export const style = StyleSheet.create({
  containerHeader: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    marginHorizontal: 30,
    marginVertical: 20,
    alignItems: 'center',
  },
  textHeader: {
    fontSize: 30,
    color: '#fff',
    fontWeight: 'bold',
  },
  buttonNewTransaction: {
    backgroundColor: '#304439',
    borderRadius: 20,
    borderWidth: 0.5,
    width: 150,
    height: 50,
    justifyContent: 'center',
    alignItems: 'center',
  },
  textButtonTransaction: {
    color: '#fff',
  },
});
