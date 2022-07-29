
import requests
import KEY
from requests import Session
from pprint import pprint as pp

class CMC:
    def __init__(self,token):
        self.apiurl = 'https://pro-api.coinmarketcap.com'
        self.headers = {'Accepts': 'application/json','X-CMC_PRO_API_KEY': token,}
        self.session = Session()
        self.session.headers.update(self.headers)

    def getallcoins(self):
        url = self.apiurl + '/v1/cryptocurrency/map'
        response = self.session.get(url)
        data = response.json()['data']
        return data

    def getprice(self, symbol):
        url = self.apiurl + '/v1/cryptocurrency/quotes/latest'
        parameters = {'symbol' : symbol}
        response = self.session.get(url, params = parameters)
        data = response.json()['data']
        return data

cmc = CMC(KEY.The_key)
print(pp(cmc.getallcoins()))


