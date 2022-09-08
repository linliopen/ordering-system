# ll-food-ordering-system

## Installation Guide

### Prepare App 
This app is a springboot + mysql application using java language.

Use maven tool to package and produce a executable jar.

```aidl
mvn clean install
```

You can skip this step, because i have produced this jar in target directory.

### Prepare App Docker Image
Dockerfile for build app image at project root directory.

Run this command at project root directory.

```aidl
docker build -t looped/ll-food-ordering-system:1.0.0 .
```

### Prepare App Helm Chart

Chart at project root directory.

First add helm repo binami and install mysql dependency.

Run this command at chart/ll-food-ordering-system directory.
```aidl
helm repo add binami https://charts.bitnami.com/bitnami

helm dependency build
```

Second install this chart

```aidl
helm install ll-food-ordering-system . --create-namespace -n looped
```

Then, waiting for app and mysql pod running. 
```aidl
kubectl get pods -w
```

### Visit App Website

After app pod and mysql pod are running healthly,

Find out ll-food-ordering-system pod name 
```aidl
kubectl get pods -n looped
```

Then, run this command
```aidl
kubectl port-forward ${AppPodName} 8080:8080 -n looped
```
For exmaple 
```aidl
kubectl port-forward ll-food-ordering-system-584f857f5f-gxcl2 8080:8080 -n looped
```

Finally open Browser, visit localost:8080. 

That's all.