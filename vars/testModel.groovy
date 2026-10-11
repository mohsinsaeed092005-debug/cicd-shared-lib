def call(String dataset, String model, String alias) {
    sh """
        . .venv/bin/activate
        python src/test_model.py --dataset ${dataset} --model ${model} --alias ${alias}
    """
}
