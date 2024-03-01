#!/bin/bash
echo "Downloading chromedriver"
curl -o chromedriver.zip "https://chromedriver.storage.googleapis.com/85.0.4183.87/chromedriver_linux64.zip"
echo "Unzipping chromedriver.zip"
chmod +x chromedriver.zip
unzip chromedriver.zip
echo "Removing chromedriver.zip"
rm -f chromedriver.zip
chmod +x chromedriver