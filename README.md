{
	"info": {
		"_postman_id": "47abcacd-d9ed-4a36-9ce5-cd82dd3e9f54",
		"name": "Test1 api",
		"schema": "https://schema.getpostman.com/json/collection/v2.1.0/collection.json",
		"_exporter_id": "30113311"
	},
	"item": [
		{
			"name": "insert data",
			"request": {
				"method": "POST",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\r\n    \"name\": \"abc\",\r\n    \"address\": \"Banglore\",\r\n    \"city\":\"Banglore\",\r\n    \"country\":\"india\",\r\n    \"pincode\":\"45678\",\r\n    \"sat\":\"55\",\r\n    \"result\":\"Pass\"\r\n}",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://localhost:9090/insertData",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "9090",
					"path": [
						"insertData"
					]
				}
			},
			"response": []
		},
		{
			"name": "View all data",
			"request": {
				"method": "GET",
				"header": []
			},
			"response": []
		},
		{
			"name": "View all rank data",
			"request": {
				"method": "GET",
				"header": []
			},
			"response": []
		},
		{
			"name": "Pass OR Fail",
			"request": {
				"method": "GET",
				"header": []
			},
			"response": []
		},
		{
			"name": "update rank",
			"request": {
				"method": "PUT",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\r\n    \"sat\":\"100\"\r\n}",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://localhost:9090/updateuser",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "9090",
					"path": [
						"updateuser"
					]
				}
			},
			"response": []
		}
	]
}
