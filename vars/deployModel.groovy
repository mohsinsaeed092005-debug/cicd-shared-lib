def call(String dataset, String model, String alias, String envName) {
    sh """
        . .venv/bin/activate
        python src/deploy.py --dataset ${dataset} --model ${model} --alias ${alias} --env ${envName}
    """
}
