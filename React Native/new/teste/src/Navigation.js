import React from 'react';
import {createBottomTabNavigator} from '@react-navigation/bottom-tabs';
import SimpleLineIcons from 'react-native-vector-icons/SimpleLineIcons';
import Ionicons from 'react-native-vector-icons/Ionicons';
import MaterialIcons from 'react-native-vector-icons/MaterialIcons';
import Fontisto from 'react-native-vector-icons/Fontisto';
import SpeedScreen from './screens/Speed';
import ResumeScreen from './screens/Resume';
import HistoryScreen from './screens/History';
import SettingsScreen from './screens/Settings';

const Tab = createBottomTabNavigator();

const icons = {
  Speed: {
    lib: SimpleLineIcons,
    name: 'trash',
  },
  Resume: {
    lib: MaterialIcons,
    name: 'content-paste',
  },
  History: {
    lib: Ionicons,
    name: 'newspaper-outline',
  },
  Settings: {
    lib: Fontisto,
    name: 'player-settings',
  },
};

function Navigation() {
  return (
    <Tab.Navigator
      screenOptions={({route}) => ({
        tabBarIcon: ({color, size}) => {
          const {lib: Icon, name} = icons[route.name];
          return <Icon name={name} size={size} color={color} />;
        },
      })}
      tabBarOptions={{
        style: {
          backgroundColor: '#f8f8f8',
          borderTopColor: '#bdb3b0',
        },
        activeTintColor: '#136f9c',
        inactiveTintColor: '#747474',
      }}>
      <Tab.Screen
        name="Speed"
        component={SpeedScreen}
        options={{
          title: 'Velocimetro',
        }}
      />
      <Tab.Screen
        name="Resume"
        component={ResumeScreen}
        options={{
          title: 'Resumo',
        }}
      />
      <Tab.Screen
        name="History"
        component={HistoryScreen}
        options={{
          title: 'Histórico',
        }}
      />
      <Tab.Screen
        name="Settings"
        component={SettingsScreen}
        options={{
          title: 'Ajustes',
        }}
      />
    </Tab.Navigator>
  );
}

export default Navigation;
