import React from 'react';
import {Text, Image, View, ScrollView} from 'react-native';
import Style from './Styles';

export default Title = () => {
  return (
    <View style={Style.container}>
      <Text style={Style.teste}>Pai tá On</Text>
      <Image
        source={require('../../Assets/Wallpaper2.jpg')}
        style={Style.img}
      />
    </View>
  );
};
